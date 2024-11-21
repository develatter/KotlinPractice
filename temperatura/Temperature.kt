package temperatura

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

/**
 * Escribe una clase Temperatura que convierta de grados Celsius a Farenheit y vicecersa. Para ello crea dos métodos
 *      - double celsiusToFarenheit(double)
 *      - double farenheitToCelsius(double)
 */
class Temperature {

    companion object {
        fun celsiusToFarenheit(celsius: Double) = DecimalFormat(
            "####.##",
            DecimalFormatSymbols(
                Locale("en", "EN")
            )
        ).format(celsius * 1.8 + 32)

        fun farenheitToCelsius(farenheit: Double) = DecimalFormat(
            "####.##",
            DecimalFormatSymbols(
                Locale("en", "EN")
            )
        ).format( (farenheit - 32) / 1.8)
    }

}