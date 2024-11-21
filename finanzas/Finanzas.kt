package finanzas

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*


class Finanzas(private var tipoDeCambio : Double = 1.07) {


    init {
        tipoDeCambio = if (tipoDeCambio == 0.0) 1.07 else tipoDeCambio
        println("Tipo establecido en $tipoDeCambio")
    }

    fun dolaresToEuros(dolares : Double) = DecimalFormat(
        "####.##",
        DecimalFormatSymbols(
            Locale("en", "EN")
        )
    ).format(dolares / tipoDeCambio)

    fun eurosToDolares(euros : Double) = DecimalFormat(
        "####.##",
        DecimalFormatSymbols(
            Locale("en", "EN")
        )
    ).format(euros * tipoDeCambio)

}