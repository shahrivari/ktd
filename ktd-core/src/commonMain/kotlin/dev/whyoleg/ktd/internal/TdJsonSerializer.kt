package dev.whyoleg.ktd.internal

import dev.whyoleg.ktd.api.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.*

internal class TdJsonSerializer(serialModule: SerialModule) {
    private val json = Json(jsonConfiguration, serialModule + builtInJsonModule)

    fun parse(string: String): TdApiResponse = json.parse(responseSerializer, string)
    fun stringify(request: TdApiRequest): String = json.stringify(requestSerializer, request)
}

private val jsonConfiguration = JsonConfiguration.Stable.copy(
    classDiscriminator = "@type",
    ignoreUnknownKeys = true,
    isLenient = true,
    encodeDefaults = false
)

private val responseSerializer = PolymorphicSerializer(TdApiResponse::class)
private val requestSerializer = PolymorphicSerializer(TdRequest::class)

private val builtInJsonModule = SerializersModule {
    polymorphic<TdApiRequest> {
        subclass(TdClose.serializer())
        subclass(TdDestroy.serializer())
        subclass(TdLogOut.serializer())
    }
    polymorphic<TdApiResponse> {
        subclass(TdOk.serializer())
        subclass(TdError.serializer())
    }
}
