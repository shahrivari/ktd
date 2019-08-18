@file:Suppress("unused")

package dev.whyoleg.ktd.api.passport

import dev.whyoleg.ktd.*
import dev.whyoleg.ktd.api.TdApi.*

/**
 * Returns one of the available Telegram Passport elements
 *
 * @type - Telegram Passport element type
 * @password - Password of the current user
 */
suspend fun TelegramClient.getPassportElement(
    type: PassportElementType,
    password: String
): PassportElement = passport(
    GetPassportElement(
        type,
        password
    )
)

/**
 * Returns all available Telegram Passport elements
 *
 * @password - Password of the current user
 */
suspend fun TelegramClient.getAllPassportElements(
    password: String
): PassportElements = passport(
    GetAllPassportElements(
        password
    )
)

/**
 * Adds an element to the user's Telegram Passport. May return an error with a message "PHONE_VERIFICATION_NEEDED" or "EMAIL_VERIFICATION_NEEDED" if the chosen phone number or the chosen email address must be verified first
 *
 * @element - Input Telegram Passport element
 * @password - Password of the current user
 */
suspend fun TelegramClient.setPassportElement(
    element: InputPassportElement,
    password: String
): PassportElement = passport(
    SetPassportElement(
        element,
        password
    )
)

/**
 * Deletes a Telegram Passport element
 *
 * @type - Element type
 */
suspend fun TelegramClient.deletePassportElement(
    type: PassportElementType
): Ok = passport(
    DeletePassportElement(
        type
    )
)

/**
 * Informs the user that some of the elements in their Telegram Passport contain errors; for bots only. The user will not be able to resend the elements, until the errors are fixed
 *
 * @userId - User identifier
 * @errors - The errors
 */
suspend fun TelegramClient.setPassportElementErrors(
    userId: Int,
    errors: Array<InputPassportElementError>
): Ok = passport(
    SetPassportElementErrors(
        userId,
        errors
    )
)

/**
 * Returns a Telegram Passport authorization form for sharing data with a service
 *
 * @botUserId - User identifier of the service's bot
 * @scope - Telegram Passport element types requested by the service
 * @publicKey - Service's publicKey
 * @nonce - Authorization form nonce provided by the service
 */
suspend fun TelegramClient.getPassportAuthorizationForm(
    botUserId: Int,
    scope: String,
    publicKey: String,
    nonce: String
): PassportAuthorizationForm = passport(
    GetPassportAuthorizationForm(
        botUserId,
        scope,
        publicKey,
        nonce
    )
)

/**
 * Returns already available Telegram Passport elements suitable for completing a Telegram Passport authorization form. Result can be received only once for each authorization form
 *
 * @autorizationFormId - Authorization form identifier
 * @password - Password of the current user
 */
suspend fun TelegramClient.getPassportAuthorizationFormAvailableElements(
    autorizationFormId: Int,
    password: String
): PassportElementsWithErrors = passport(
    GetPassportAuthorizationFormAvailableElements(
        autorizationFormId,
        password
    )
)

/**
 * Sends a Telegram Passport authorization form, effectively sharing data with the service. This method must be called after getPassportAuthorizationFormAvailableElements if some previously available elements need to be used
 *
 * @autorizationFormId - Authorization form identifier
 * @types - Types of Telegram Passport elements chosen by user to complete the authorization form
 */
suspend fun TelegramClient.sendPassportAuthorizationForm(
    autorizationFormId: Int,
    types: Array<PassportElementType>
): Ok = passport(
    SendPassportAuthorizationForm(
        autorizationFormId,
        types
    )
)