package net.rsprox.protocol.v231.game.incoming.decoder.codec.events

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.model.events.EventCameraPosition
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.incoming.decoder.prot.GameClientProt

public class EventCameraPositionDecoder : ProxyMessageDecoder<EventCameraPosition> {
    override val prot: ClientProt = GameClientProt.EVENT_CAMERA_POSITION

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): EventCameraPosition {
        val angleY = buffer.g2Alt3()
        val angleX = buffer.g2Alt3()
        return EventCameraPosition(
            angleX,
            angleY,
        )
    }
}
