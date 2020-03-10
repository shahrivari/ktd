package dev.whyoleg.ktd.api

import dev.whyoleg.ktd.api.updates.*
import kotlinx.serialization.modules.*

@Deprecated(
    message = "Used internally",
    level = DeprecationLevel.ERROR
)
val coreApiBuilder: Lazy<SerialModule> = lazy {
    SerializersModule {
        polymorphic<TdApiRequest> {
            subclass(TdGetAuthorizationState.serializer())
            subclass(TdSetTdlibParameters.serializer())
            subclass(TdCheckDatabaseEncryptionKey.serializer())
            subclass(TdSetAuthenticationPhoneNumber.serializer())
            subclass(TdResendAuthenticationCode.serializer())
            subclass(TdCheckAuthenticationCode.serializer())
            subclass(TdRequestQrCodeAuthentication.serializer())
            subclass(TdRegisterUser.serializer())
            subclass(TdCheckAuthenticationPassword.serializer())
            subclass(TdRequestAuthenticationPasswordRecovery.serializer())
            subclass(TdRecoverAuthenticationPassword.serializer())
            subclass(TdConfirmQrCodeAuthentication.serializer())
            subclass(TdGetCurrentState.serializer())
            subclass(TdSetDatabaseEncryptionKey.serializer())
            subclass(TdGetMe.serializer())
            subclass(TdGetUser.serializer())
            subclass(TdGetUserFullInfo.serializer())
            subclass(TdGetBasicGroup.serializer())
            subclass(TdGetBasicGroupFullInfo.serializer())
            subclass(TdGetSupergroup.serializer())
            subclass(TdGetSupergroupFullInfo.serializer())
            subclass(TdGetSecretChat.serializer())
            subclass(TdGetChat.serializer())
            subclass(TdGetMessage.serializer())
            subclass(TdGetMessageLocally.serializer())
            subclass(TdGetRepliedMessage.serializer())
            subclass(TdGetChatPinnedMessage.serializer())
            subclass(TdGetMessages.serializer())
            subclass(TdGetFile.serializer())
            subclass(TdGetRemoteFile.serializer())
            subclass(TdSearchPublicChat.serializer())
            subclass(TdGetChatMessageByDate.serializer())
            subclass(TdGetMessageLinkInfo.serializer())
            subclass(TdSendMessage.serializer())
            subclass(TdSendMessageAlbum.serializer())
            subclass(TdForwardMessages.serializer())
            subclass(TdResendMessages.serializer())
            subclass(TdSendChatSetTtlMessage.serializer())
            subclass(TdDeleteMessages.serializer())
            subclass(TdEditMessageText.serializer())
            subclass(TdEditMessageLiveLocation.serializer())
            subclass(TdEditMessageMedia.serializer())
            subclass(TdEditMessageCaption.serializer())
            subclass(TdGetTextEntities.serializer())
            subclass(TdParseTextEntities.serializer())
            subclass(TdGetFileMimeType.serializer())
            subclass(TdGetFileExtension.serializer())
            subclass(TdCleanFileName.serializer())
            subclass(TdGetLanguagePackString.serializer())
            subclass(TdGetJsonValue.serializer())
            subclass(TdGetJsonString.serializer())
            subclass(TdStopPoll.serializer())
            subclass(TdSendChatAction.serializer())
            subclass(TdCreatePrivateChat.serializer())
            subclass(TdCreateBasicGroupChat.serializer())
            subclass(TdCreateSupergroupChat.serializer())
            subclass(TdCreateSecretChat.serializer())
            subclass(TdCreateNewSecretChat.serializer())
            subclass(TdSetChatTitle.serializer())
            subclass(TdSetChatPhoto.serializer())
            subclass(TdSetChatPermissions.serializer())
            subclass(TdSetChatClientData.serializer())
            subclass(TdSetChatDescription.serializer())
            subclass(TdPinChatMessage.serializer())
            subclass(TdUnpinChatMessage.serializer())
            subclass(TdLeaveChat.serializer())
            subclass(TdSetChatMemberStatus.serializer())
            subclass(TdGetChatMember.serializer())
            subclass(TdSearchChatMembers.serializer())
            subclass(TdGetChatAdministrators.serializer())
            subclass(TdDownloadFile.serializer())
            subclass(TdGetFileDownloadedPrefixSize.serializer())
            subclass(TdCancelDownloadFile.serializer())
            subclass(TdUploadFile.serializer())
            subclass(TdCancelUploadFile.serializer())
            subclass(TdWriteGeneratedFilePart.serializer())
            subclass(TdSetFileGenerationProgress.serializer())
            subclass(TdFinishFileGeneration.serializer())
            subclass(TdReadFilePart.serializer())
            subclass(TdDeleteFile.serializer())
            subclass(TdGenerateChatInviteLink.serializer())
            subclass(TdGetUserProfilePhotos.serializer())
            subclass(TdGetStickerSet.serializer())
            subclass(TdSearchStickerSet.serializer())
            subclass(TdSearchInstalledStickerSets.serializer())
            subclass(TdSearchStickerSets.serializer())
            subclass(TdSetSupergroupStickerSet.serializer())
            subclass(TdGetSupergroupMembers.serializer())
            subclass(TdCloseSecretChat.serializer())
            subclass(TdGetPushReceiverId.serializer())
            subclass(TdGetOption.serializer())
            subclass(TdSetOption.serializer())
            subclass(TdGetStorageStatistics.serializer())
            subclass(TdGetStorageStatisticsFast.serializer())
            subclass(TdGetDatabaseStatistics.serializer())
            subclass(TdOptimizeStorage.serializer())
            subclass(TdSetNetworkType.serializer())
            subclass(TdGetNetworkStatistics.serializer())
            subclass(TdAddNetworkStatistics.serializer())
            subclass(TdResetNetworkStatistics.serializer())
            subclass(TdGetMapThumbnailFile.serializer())
            subclass(TdSetAlarm.serializer())
            subclass(TdGetCountryCode.serializer())
            subclass(TdGetDeepLinkInfo.serializer())
            subclass(TdAddProxy.serializer())
            subclass(TdEditProxy.serializer())
            subclass(TdEnableProxy.serializer())
            subclass(TdDisableProxy.serializer())
            subclass(TdRemoveProxy.serializer())
            subclass(TdGetProxies.serializer())
            subclass(TdGetProxyLink.serializer())
            subclass(TdPingProxy.serializer())
            subclass(TdSetLogStream.serializer())
            subclass(TdGetLogStream.serializer())
            subclass(TdSetLogVerbosityLevel.serializer())
            subclass(TdGetLogVerbosityLevel.serializer())
            subclass(TdGetLogTags.serializer())
            subclass(TdSetLogTagVerbosityLevel.serializer())
            subclass(TdGetLogTagVerbosityLevel.serializer())
            subclass(TdAddLogMessage.serializer())
            subclass(TdTestNetwork.serializer())
            subclass(TdTestProxy.serializer())
        }
        polymorphic<TdApiResponse> {
            subclass(TdAuthenticationCodeInfo.serializer())
            subclass(TdEmailAddressAuthenticationCodeInfo.serializer())
            subclass(TdTextEntities.serializer())
            subclass(TdFormattedText.serializer())
            subclass(TdPasswordState.serializer())
            subclass(TdRecoveryEmailAddress.serializer())
            subclass(TdTemporaryPasswordState.serializer())
            subclass(TdFile.serializer())
            subclass(TdUser.serializer())
            subclass(TdUserFullInfo.serializer())
            subclass(TdUserProfilePhotos.serializer())
            subclass(TdUsers.serializer())
            subclass(TdChatAdministrators.serializer())
            subclass(TdChatMember.serializer())
            subclass(TdChatMembers.serializer())
            subclass(TdBasicGroup.serializer())
            subclass(TdBasicGroupFullInfo.serializer())
            subclass(TdSupergroup.serializer())
            subclass(TdSupergroupFullInfo.serializer())
            subclass(TdSecretChat.serializer())
            subclass(TdMessage.serializer())
            subclass(TdMessages.serializer())
            subclass(TdFoundMessages.serializer())
            subclass(TdScopeNotificationSettings.serializer())
            subclass(TdChat.serializer())
            subclass(TdChats.serializer())
            subclass(TdChatsNearby.serializer())
            subclass(TdChatInviteLink.serializer())
            subclass(TdChatInviteLinkInfo.serializer())
            subclass(TdWebPageInstantView.serializer())
            subclass(TdWebPage.serializer())
            subclass(TdOrderInfo.serializer())
            subclass(TdPaymentForm.serializer())
            subclass(TdValidatedOrderInfo.serializer())
            subclass(TdPaymentResult.serializer())
            subclass(TdPaymentReceipt.serializer())
            subclass(TdPassportElements.serializer())
            subclass(TdPassportAuthorizationForm.serializer())
            subclass(TdPassportElementsWithErrors.serializer())
            subclass(TdStickers.serializer())
            subclass(TdEmojis.serializer())
            subclass(TdStickerSet.serializer())
            subclass(TdStickerSets.serializer())
            subclass(TdCallId.serializer())
            subclass(TdAnimations.serializer())
            subclass(TdImportedContacts.serializer())
            subclass(TdHttpUrl.serializer())
            subclass(TdInlineQueryResults.serializer())
            subclass(TdCallbackQueryAnswer.serializer())
            subclass(TdCustomRequestResult.serializer())
            subclass(TdGameHighScores.serializer())
            subclass(TdChatEvents.serializer())
            subclass(TdLanguagePackStrings.serializer())
            subclass(TdLanguagePackInfo.serializer())
            subclass(TdLocalizationTargetInfo.serializer())
            subclass(TdPushReceiverId.serializer())
            subclass(TdBackground.serializer())
            subclass(TdBackgrounds.serializer())
            subclass(TdHashtags.serializer())
            subclass(TdUserPrivacySettingRules.serializer())
            subclass(TdAccountTtl.serializer())
            subclass(TdSession.serializer())
            subclass(TdSessions.serializer())
            subclass(TdConnectedWebsites.serializer())
            subclass(TdPublicMessageLink.serializer())
            subclass(TdMessageLinkInfo.serializer())
            subclass(TdFilePart.serializer())
            subclass(TdStorageStatistics.serializer())
            subclass(TdStorageStatisticsFast.serializer())
            subclass(TdDatabaseStatistics.serializer())
            subclass(TdNetworkStatistics.serializer())
            subclass(TdAutoDownloadSettingsPresets.serializer())
            subclass(TdTMeUrls.serializer())
            subclass(TdCount.serializer())
            subclass(TdText.serializer())
            subclass(TdSeconds.serializer())
            subclass(TdDeepLinkInfo.serializer())
            subclass(TdProxy.serializer())
            subclass(TdProxies.serializer())
            subclass(TdUpdates.serializer())
            subclass(TdLogVerbosityLevel.serializer())
            subclass(TdLogTags.serializer())
        }
        polymorphic(TdApiResponse::class, TdAuthorizationState::class) {
            subclass(TdAuthorizationState.WaitTdlibParameters.serializer())
            subclass(TdAuthorizationState.WaitEncryptionKey.serializer())
            subclass(TdAuthorizationState.WaitPhoneNumber.serializer())
            subclass(TdAuthorizationState.WaitCode.serializer())
            subclass(TdAuthorizationState.WaitOtherDeviceConfirmation.serializer())
            subclass(TdAuthorizationState.WaitRegistration.serializer())
            subclass(TdAuthorizationState.WaitPassword.serializer())
            subclass(TdAuthorizationState.Ready.serializer())
            subclass(TdAuthorizationState.LoggingOut.serializer())
            subclass(TdAuthorizationState.Closing.serializer())
            subclass(TdAuthorizationState.Closed.serializer())
        }
        polymorphic(TdApiResponse::class, TdLoginUrlInfo::class) {
            subclass(TdLoginUrlInfo.Open.serializer())
            subclass(TdLoginUrlInfo.RequestConfirmation.serializer())
        }
        polymorphic(TdApiResponse::class, TdPassportElement::class) {
            subclass(TdPassportElement.PersonalDetails.serializer())
            subclass(TdPassportElement.Passport.serializer())
            subclass(TdPassportElement.DriverLicense.serializer())
            subclass(TdPassportElement.IdentityCard.serializer())
            subclass(TdPassportElement.InternalPassport.serializer())
            subclass(TdPassportElement.Address.serializer())
            subclass(TdPassportElement.UtilityBill.serializer())
            subclass(TdPassportElement.BankStatement.serializer())
            subclass(TdPassportElement.RentalAgreement.serializer())
            subclass(TdPassportElement.PassportRegistration.serializer())
            subclass(TdPassportElement.TemporaryRegistration.serializer())
            subclass(TdPassportElement.PhoneNumber.serializer())
            subclass(TdPassportElement.EmailAddress.serializer())
        }
        polymorphic(TdApiResponse::class, TdLanguagePackStringValue::class) {
            subclass(TdLanguagePackStringValue.Ordinary.serializer())
            subclass(TdLanguagePackStringValue.Pluralized.serializer())
            subclass(TdLanguagePackStringValue.Deleted.serializer())
        }
        polymorphic(TdApiResponse::class, TdCanTransferOwnershipResult::class) {
            subclass(TdCanTransferOwnershipResult.Ok.serializer())
            subclass(TdCanTransferOwnershipResult.PasswordNeeded.serializer())
            subclass(TdCanTransferOwnershipResult.PasswordTooFresh.serializer())
            subclass(TdCanTransferOwnershipResult.SessionTooFresh.serializer())
        }
        polymorphic(TdApiResponse::class, TdCheckChatUsernameResult::class) {
            subclass(TdCheckChatUsernameResult.Ok.serializer())
            subclass(TdCheckChatUsernameResult.UsernameInvalid.serializer())
            subclass(TdCheckChatUsernameResult.UsernameOccupied.serializer())
            subclass(TdCheckChatUsernameResult.PublicChatsTooMuch.serializer())
            subclass(TdCheckChatUsernameResult.PublicGroupsUnavailable.serializer())
        }
        polymorphic(TdApiResponse::class, TdOptionValue::class) {
            subclass(TdOptionValue.Boolean.serializer())
            subclass(TdOptionValue.Empty.serializer())
            subclass(TdOptionValue.Integer.serializer())
            subclass(TdOptionValue.String.serializer())
        }
        polymorphic(TdApiResponse::class, TdJsonValue::class) {
            subclass(TdJsonValue.Null.serializer())
            subclass(TdJsonValue.Boolean.serializer())
            subclass(TdJsonValue.Number.serializer())
            subclass(TdJsonValue.String.serializer())
            subclass(TdJsonValue.Array.serializer())
            subclass(TdJsonValue.Object.serializer())
        }
        polymorphic(TdApiResponse::class, TdLogStream::class) {
            subclass(TdLogStream.Default.serializer())
            subclass(TdLogStream.File.serializer())
            subclass(TdLogStream.Empty.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateUser::class) {
            subclass(TdUpdateUser.ChatAction.serializer())
            subclass(TdUpdateUser.Status.serializer())
            subclass(TdUpdateUser.Data.serializer())
            subclass(TdUpdateUser.FullInfo.serializer())
            subclass(TdUpdateUser.PrivacySettingRules.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateChat::class) {
            subclass(TdUpdateChat.Data.serializer())
            subclass(TdUpdateChat.ChatList.serializer())
            subclass(TdUpdateChat.Title.serializer())
            subclass(TdUpdateChat.Photo.serializer())
            subclass(TdUpdateChat.Permissions.serializer())
            subclass(TdUpdateChat.LastMessage.serializer())
            subclass(TdUpdateChat.Order.serializer())
            subclass(TdUpdateChat.IsPinned.serializer())
            subclass(TdUpdateChat.IsMarkedAsUnread.serializer())
            subclass(TdUpdateChat.IsSponsored.serializer())
            subclass(TdUpdateChat.HasScheduledMessages.serializer())
            subclass(TdUpdateChat.DefaultDisableNotification.serializer())
            subclass(TdUpdateChat.ReadInbox.serializer())
            subclass(TdUpdateChat.ReadOutbox.serializer())
            subclass(TdUpdateChat.UnreadMentionCount.serializer())
            subclass(TdUpdateChat.NotificationSettings.serializer())
            subclass(TdUpdateChat.ActionBar.serializer())
            subclass(TdUpdateChat.PinnedMessage.serializer())
            subclass(TdUpdateChat.ReplyMarkup.serializer())
            subclass(TdUpdateChat.DraftMessage.serializer())
            subclass(TdUpdateChat.OnlineMemberCount.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateMessage::class) {
            subclass(TdUpdateMessage.Data.serializer())
            subclass(TdUpdateMessage.SendAcknowledged.serializer())
            subclass(TdUpdateMessage.SendSucceeded.serializer())
            subclass(TdUpdateMessage.SendFailed.serializer())
            subclass(TdUpdateMessage.Content.serializer())
            subclass(TdUpdateMessage.Edited.serializer())
            subclass(TdUpdateMessage.Views.serializer())
            subclass(TdUpdateMessage.ContentOpened.serializer())
            subclass(TdUpdateMessage.MentionRead.serializer())
            subclass(TdUpdateMessage.LiveLocationViewed.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateUnread::class) {
            subclass(TdUpdateUnread.MessageCount.serializer())
            subclass(TdUpdateUnread.ChatCount.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateSupergroup::class) {
            subclass(TdUpdateSupergroup.Data.serializer())
            subclass(TdUpdateSupergroup.FullInfo.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateBasicGroup::class) {
            subclass(TdUpdateBasicGroup.Data.serializer())
            subclass(TdUpdateBasicGroup.FullInfo.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class, TdUpdateFileGeneration::class) {
            subclass(TdUpdateFileGeneration.Start.serializer())
            subclass(TdUpdateFileGeneration.Stop.serializer())
        }
        polymorphic(TdApiResponse::class, TdUpdate::class) {
            subclass(TdUpdateAuthorizationState.serializer())
            subclass(TdUpdateScopeNotificationSettings.serializer())
            subclass(TdUpdateNotification.serializer())
            subclass(TdUpdateNotificationGroup.serializer())
            subclass(TdUpdateActiveNotifications.serializer())
            subclass(TdUpdateHavePendingNotifications.serializer())
            subclass(TdUpdateDeleteMessages.serializer())
            subclass(TdUpdateSecretChat.serializer())
            subclass(TdUpdateServiceNotification.serializer())
            subclass(TdUpdateFile.serializer())
            subclass(TdUpdateCall.serializer())
            subclass(TdUpdateOption.serializer())
            subclass(TdUpdateInstalledStickerSets.serializer())
            subclass(TdUpdateTrendingStickerSets.serializer())
            subclass(TdUpdateRecentStickers.serializer())
            subclass(TdUpdateFavoriteStickers.serializer())
            subclass(TdUpdateSavedAnimations.serializer())
            subclass(TdUpdateSelectedBackground.serializer())
            subclass(TdUpdateLanguagePackStrings.serializer())
            subclass(TdUpdateConnectionState.serializer())
            subclass(TdUpdateTermsOfService.serializer())
            subclass(TdUpdateUsersNearby.serializer())
        }
    }
}

