package com.ze.hudi.intellijbug

fun main(args: Array<String>) {
    println("RECORDKEY_FIELD_OPT_KEY: ${org.apache.hudi.DataSourceWriteOptions.RECORDKEY_FIELD_OPT_KEY()}")
    println("TABLE_NAME: ${org.apache.hudi.config.HoodieWriteConfig.TABLE_NAME}")
}
