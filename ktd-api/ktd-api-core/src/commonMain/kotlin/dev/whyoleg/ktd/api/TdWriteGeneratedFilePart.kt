package dev.whyoleg.ktd.api

import kotlinx.serialization.*

/**
 * Writes a part of a generated file
 * This method is intended to be used only if the client has no direct access to TDLib's file system, because it is usually slower than a direct write to the destination file
 *
 * @property generationId The identifier of the generation process
 * @property offset The offset from which to write the data to the file
 * @property data The data to write
 * @property extra Extra data shared between request and response
 */
@Serializable
@SerialName("writeGeneratedFilePart")
data class TdWriteGeneratedFilePart(
    @SerialName("generation_id")
    val generationId: Long = 0L,
    @SerialName("offset")
    val offset: Int = 0,
    @SerialName("data")
    val data: ByteArray = byteArrayOf(),
    @SerialName("@extra")
    override val extra: TdExtra = TdExtra.EMPTY
) : TdRequest<TdOk> {
    @Suppress("OverridingDeprecatedMember")
    override fun withRequestId(id: Long): TdWriteGeneratedFilePart {
        return copy(extra = extra.copy(id = id))
    }
}