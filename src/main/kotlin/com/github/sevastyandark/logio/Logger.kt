/*
 * Copyright 2018      Sevastyan Pigarev
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.github.sevastyandark.logio

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Logger(val name: String, val dateFormat: String, val printFormat: String)
{
    fun info(x: Any)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", x.toString())
        tmpFormat = tmpFormat.replace("%log_level%", "INFO")
        println(tmpFormat)
    }
    fun warn(x: Any)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", x.toString())
        tmpFormat = tmpFormat.replace("%log_level%", "WARN")
        println(tmpFormat)
    }
    fun error(x: Any)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", x.toString())
        tmpFormat = tmpFormat.replace("%log_level%", "ERROR")
        println(tmpFormat)
    }
    fun critical(x: Any)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", x.toString())
        tmpFormat = tmpFormat.replace("%log_level%", "CRITICAL")
        println(tmpFormat)
    }
    fun debug(x: Any)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", x.toString())
        tmpFormat = tmpFormat.replace("%log_level%", "DEBUG")
        println(tmpFormat)
    }
}
