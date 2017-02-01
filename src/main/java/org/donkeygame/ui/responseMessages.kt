package org.donkeygame.ui

import org.donkeygame.core.Card

data class GameOfDonkeyCreatedResponse(val matchName: String)

data class AlertResponse(
        val success: Boolean,
        val response: String
)

data class HandResponse(val hand: List<Card> )

data class CardPlayMessage(val card: String)