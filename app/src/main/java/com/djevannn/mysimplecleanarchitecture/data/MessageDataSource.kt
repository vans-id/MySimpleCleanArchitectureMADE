package com.djevannn.mysimplecleanarchitecture.data

import com.djevannn.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity(
            "Hello $name! Welcome to Clean Architecture"
        )
}