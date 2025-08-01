package net.rsprox.protocol.v231.game.outgoing.decoder.codec.logout

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.metadata.Consistent
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.logout.LogoutTransfer
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.outgoing.decoder.prot.GameServerProt

@Consistent
internal class LogoutTransferDecoder : ProxyMessageDecoder<LogoutTransfer> {
    override val prot: ClientProt = GameServerProt.LOGOUT_TRANSFER

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): LogoutTransfer {
        val host = buffer.gjstr()
        val id = buffer.g2()
        val properties = buffer.g4()
        return LogoutTransfer(
            host,
            id,
            properties,
        )
    }
}
