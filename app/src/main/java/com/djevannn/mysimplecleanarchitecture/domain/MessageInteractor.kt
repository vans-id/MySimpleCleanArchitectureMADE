package com.djevannn.mysimplecleanarchitecture.domain

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {

    override fun getMessage(name: String): MessageEntity =
        messageRepository.getWelcomeMessage(name)

}