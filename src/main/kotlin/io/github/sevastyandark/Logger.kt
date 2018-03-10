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

package io.github.sevastyandark.logio

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Logger(val name: String, val dateFormat: String, val printFormat: String)
{
    private fun log(logLevel: String, message: String)
    {
        val nowTime = LocalDateTime.now()
        val formatted = nowTime.format(DateTimeFormatter.ofPattern(dateFormat))
        var tmpFormat = printFormat
        tmpFormat = tmpFormat.replace("%date%", formatted)
        tmpFormat = tmpFormat.replace("%name%", name)
        tmpFormat = tmpFormat.replace("%text%", message)
        tmpFormat = tmpFormat.replace("%log_level%", logLevel)
        println(tmpFormat)
    }
    fun info(x: Any)
    {
        log("INFO", x.toString())
    }
    fun warn(x: Any)
    {
        log("WARN", x.toString())
    }
    fun error(x: Any)
    {
        log("ERROR", x.toString())
    }
    fun critical(x: Any)
    {
        log("CRITICAL", x.toString())
    }
    fun debug(x: Any)
    {
        log("DEBUG", x.toString())
    }
}
