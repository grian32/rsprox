package net.rsprox.protocol.game.outgoing.decoder.codec.zone.payload

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.decoder.prot.GameServerProt
import net.rsprox.protocol.game.outgoing.model.zone.payload.ObjCount
import net.rsprox.protocol.game.outgoing.model.zone.payload.util.CoordInZone
import net.rsprox.protocol.session.Session

public class ObjCountDecoder : ProxyMessageDecoder<ObjCount> {
    override val prot: ClientProt = GameServerProt.OBJ_COUNT

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): ObjCount {
        val coordInZone = CoordInZone(buffer.g1Alt3())
        val newQuantity = buffer.g4()
        val id = buffer.g2Alt3()
        val oldQuantity = buffer.g4Alt2()
        return ObjCount(
            id,
            oldQuantity,
            newQuantity,
            coordInZone,
        )
    }
}
