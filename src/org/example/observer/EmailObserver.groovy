package org.example.observer

class EmailObserver implements Observer {
    void update(String event, def script) {
        script.echo "Sending Email notification for event: ${event}"
        script.sh "echo 'Email sent: ${event}'"
    }
}
