package net.rsprox.protocol.v224.game.outgoing.decoder.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.util.gCombinedIdAlt2
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.interfaces.IfSetEventsV1
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v224.game.outgoing.decoder.prot.GameServerProt

internal class IfSetEventsV1Decoder : ProxyMessageDecoder<IfSetEventsV1> {
    override val prot: ClientProt = GameServerProt.IF_SETEVENTS_V1

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): IfSetEventsV1 {
        val start = buffer.g2Alt1()
        val end = buffer.g2Alt1()
        val events = buffer.g4Alt2()
        val combinedId = buffer.gCombinedIdAlt2()
        return IfSetEventsV1(
            combinedId.interfaceId,
            combinedId.componentId,
            start,
            end,
            events,
        )
    }
}
