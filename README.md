# BroadcastReceiver
Las aplicaciones de Android pueden enviar o recibir mensajes de difusión desde el sistema Android y otras aplicaciones de Android, 
de forma similar al patrón de diseño de publicación y suscripción . Estas transmisiones se envían cuando ocurre un evento de interés. 
Por ejemplo, el sistema Android envía difusiones cuando ocurren varios eventos del sistema, como cuando el sistema arranca o el 
dispositivo comienza a cargarse. Las aplicaciones también pueden enviar transmisiones personalizadas, por ejemplo, para notificar a 
otras aplicaciones algo que les pueda interesar (por ejemplo, se han descargado algunos datos nuevos).

El sistema envía transmisiones automáticamente cuando ocurren varios eventos del sistema, como cuando el sistema se conecta y desconecta 
del modo avión. Las transmisiones del sistema se envían a todas las aplicaciones que están suscritas para recibir el evento.

El mensaje de difusión en sí está envuelto en un Intent objeto cuya cadena de acción identifica el evento que ocurrió 
(por ejemplo android.intent.action.AIRPLANE_MODE). La intención también puede incluir información adicional incluida en su 
campo adicional. Por ejemplo, la intención del modo avión incluye un booleano extra que indica si el modo avión está activado o no.
