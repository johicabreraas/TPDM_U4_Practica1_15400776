package ittepic.edu.mx.tpdm_u4_practica1_15400776

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity): View(p){

    val imagen= BitmapFactory.decodeResource(resources,R.drawable.luna)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p= Paint()

        setBackgroundColor(Color.rgb(14,41,71))

        c.drawBitmap(imagen,170f,1000f,p)

                      //Nube
        p.color= Color.rgb(123,166,195)
        c.drawCircle(900f,200f,46f,p)
        c.drawCircle(910f,220f,44f,p)
        c.drawCircle(930f,240f,44f,p)
        c.drawCircle(930f,250f,50f,p)
        c.drawCircle(930f,260f,43f,p)

        c.drawCircle(910f,280f,44f,p)
        c.drawCircle(880f,240f,43f,p)
        c.drawCircle(880f,250f,43f,p)
        c.drawCircle(880f,260f,48f,p)

        c.drawCircle(910f,300f,50f,p)
        c.drawCircle(930f,320f,45f,p)
        c.drawCircle(930f,340f,43f,p)
        c.drawCircle(930f,350f,44f,p)

        c.drawCircle(910f,300f,44f,p)
        c.drawCircle(880f,320f,46f,p)
        c.drawCircle(880f,340f,43f,p)
        c.drawCircle(880f,350f,42f,p)

        c.drawCircle(900f,360f,47f,p)
        c.drawCircle(910f,360f,50f,p)
        c.drawCircle(920f,370f,44f,p)



        p.color= Color.WHITE
        c.drawCircle(-500f,1750f,1125f,p)
        //montaña Derecha
        p.color= Color.rgb(202,202,202)
        c.drawCircle(-500f,1750f,1100f,p)


             // Hombre de nieve
        p.color= Color.WHITE
        c.drawCircle(200f,1200f,40f,p)
        p.color= Color.WHITE
        c.drawCircle(260f,1200f,30f,p)
        p.color= Color.BLACK
        c.drawRect(300f, 1170f, 290f, 1230f, p)
        c.drawRect(330f, 1188f, 300f, 1214f, p) //left= me acerco mas a la izquierda <--     top=    right= me acerco mas a la izquierda -->   bottom=
        c.drawRect(200f, 1200f, 230f, 1210f, p)
        c.drawRect(260f, 1180f, 250f, 1210f, p)
        c.drawRect(270f, 1190f, 280f, 1200f, p)


                     //Arbol 1
        p.color= Color.rgb(88,114,70)
        c.drawCircle(260f,1400f,40f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(270f,1390f,28f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(280f,1390f,28f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(290f,1400f,40f,p)

        p.color= Color.rgb(88,114,70)
        c.drawCircle(320f,1400f,32f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(330f,1390f,28f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(340f,1390f,28f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(350f,1400f,40f,p)

        p.color= Color.rgb(88,114,70)
        c.drawCircle(260f,1420f,40f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(270f,1430f,28f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(280f,1430f,32f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(290f,1420f,40f,p)

        p.color= Color.rgb(88,114,70)
        c.drawCircle(320.1f,1410f,53f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(330f,1430f,32f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(340f,1430f,28f,p)
        p.color= Color.rgb(88,114,70)
        c.drawCircle(350f,1420f,40f,p)
        p.color= Color.BLACK
        c.drawRect(250f, 1425f, 200f, 1390f, p)

        p.color= Color.WHITE
        c.drawCircle(-500f,-90f,1125f,p)
        //montaña Derecha
        p.color= Color.rgb(202,202,202)
        c.drawCircle(-500f,-90f,1100f,p)


                     //pino
        p.color = Color.rgb(90, 74, 7)
        c.drawRect(150f, 320f, 200f, 300f, p)
        p.color = Color.rgb(0, 131, 0)
        c.drawRect(220f, 255f, 200f, 355f, p)
        c.drawRect(240f, 275f, 210f, 345f, p)
        c.drawRect(260f, 285f, 220f, 335f, p)
        c.drawRect(280f, 295f, 230f, 325f, p)
        c.drawRect(300f, 305f, 230f, 320f, p)








    }
}