package com.djevannn.mysimplecleanarchitecture.di

import com.djevannn.mysimplecleanarchitecture.data.IMessageDataSource
import com.djevannn.mysimplecleanarchitecture.data.MessageDataSource
import com.djevannn.mysimplecleanarchitecture.data.MessageRepository
import com.djevannn.mysimplecleanarchitecture.domain.IMessageRepository
import com.djevannn.mysimplecleanarchitecture.domain.MessageInteractor
import com.djevannn.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }

}