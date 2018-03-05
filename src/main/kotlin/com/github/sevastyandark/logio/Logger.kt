package com.github.sevastyandark.logio

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Logger(val name: String, val dateFormat: String = "yyyy-MM-dd HH:mm:ss.SSS", val printFormat: String = "[%date%] [%name%]: %text%")
{
    fun log(x: Any)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", x.toString())
        println(tmpFormat)
    }
}
