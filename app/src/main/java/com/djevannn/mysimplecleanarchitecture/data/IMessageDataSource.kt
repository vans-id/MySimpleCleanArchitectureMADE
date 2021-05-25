package com.djevannn.mysimplecleanarchitecture.data

import com.djevannn.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}