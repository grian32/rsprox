package net.rsprox.protocol.v230.game.outgoing.decoder.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.util.gCombinedId
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.interfaces.IfSetObject
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v230.game.outgoing.decoder.prot.GameServerProt

internal class IfSetObjectDecoder : ProxyMessageDecoder<IfSetObject> {
    override val prot: ClientProt = GameServerProt.IF_SETOBJECT

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): IfSetObject {
        val count = buffer.g4Alt3()
        val combinedId = buffer.gCombinedId()
        val obj = buffer.g2Alt1()
        return IfSetObject(
            combinedId.interfaceId,
            combinedId.componentId,
            obj,
            count,
        )
    }
}
