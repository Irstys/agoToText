fun main() {
    val seconds = 10000
    val ago = agoToText(seconds)
    print(ago)
}



fun agoToText(seconds: Int): String {
    val text= when (seconds) {
        in 0..60->"только что"
        in 61..60*60->"${seconds/60} ${minutesAgo(seconds)}"
        in 60*60+1..60*60*24->"${seconds/(60*60)} ${timesAgo(seconds)}"
        in 60*60*24+1..60*60*48->"сегодня"
        in 60*60*48+1..60*60*72->"вчера"
        else->"давно"
    }
    return text
}

fun  minutesAgo(seconds: Int): String {
    val minutes = when (seconds/60){
        1,21,31,41,51 ->"минуту назад"
        in 2..4,in 22..24,in 32..34,in 42..44,in 52..54->"минуты назад"
        else ->"минут назад"
    }
    return minutes
}

fun timesAgo(seconds: Int): String  {
    val times = when (seconds/(60*60)){
        1,21 ->"час назад"
        in 2..4,in 22..24 -> "часа назад"
        else -> "часов назад"
    }
    return times
}
