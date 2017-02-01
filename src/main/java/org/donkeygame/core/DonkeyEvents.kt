package org.donkeygame.core

data class GameOfDonkeyCreatedEvent(val matchName: String)

data class GameOfDonkeyStartedEvent(val matchName: String)

data class GameOfDonkeyJoinedEvent(
        val matchName: String,
        val playerName: String
)

data class CardsDealtForPlayerEvent(
        val matchName: String,
        val playerName: String,
        val cards: List<Card>
)

data class CardSelectedEvent(
        val matchName: String,
        val playerName: String,
        val selectedCard: Card
)

data class CardsPlayedEvent(
        val matchName: String,
        val playerName: String,
        val plays: Map<String, Card>
)

data class FinishedCalledEvent(val matchName: String)
