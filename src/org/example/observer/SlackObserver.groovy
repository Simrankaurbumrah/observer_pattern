package org.example.observer

class SlackObserver implements Observer {
    void update(String event, def script) {
        script.echo "Sending Slack notification for event: ${event}"
        script.sh "echo 'Slack message: ${event}'"
    }
}
