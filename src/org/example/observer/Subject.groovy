package org.example.observer

class Subject {
    private observers = []

    void attach(Observer observer) {
        observers << observer
    }

    void notifyAll(String event, def script) {
        observers.each { it.update(event, script) }
    }
}
