package net.rsprox.protocol.v231.game.outgoing.decoder.codec.misc.player

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.misc.player.ChatFilterSettings
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.outgoing.decoder.prot.GameServerProt

internal class ChatFilterSettingsDecoder : ProxyMessageDecoder<ChatFilterSettings> {
    override val prot: ClientProt = GameServerProt.CHAT_FILTER_SETTINGS

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): ChatFilterSettings {
        val publicChatFilter = buffer.g1Alt1()
        val tradeChatFilter = buffer.g1()
        return ChatFilterSettings(
            publicChatFilter,
            tradeChatFilter,
        )
    }
}
