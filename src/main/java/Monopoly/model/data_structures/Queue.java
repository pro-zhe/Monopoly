package Monopoly.model.data_structures;

import Monopoly.model.card.Card;

public class Queue {
    Card[] cards;
    int size;
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        cards = new Card[size];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(Card card) {
        cards[rear] = card;
        rear = (rear + 1) % size;
    }

    public Card dequeue() {
        Card card = cards[front];
        front = (front + 1) % size;
        return card;
    }

    public Card peek() {
        return cards[front];
    }
}
