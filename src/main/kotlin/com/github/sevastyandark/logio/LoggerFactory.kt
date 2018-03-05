package com.github.sevastyandark.logio

object LoggerFactory
{
    fun getLog(name: String, dateFormat: String = "yyyy-MM-dd HH:mm:ss.SSS"): Logger
    {
        return Logger(name, dateFormat)
    }
}