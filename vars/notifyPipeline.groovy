//vars/notifyPipeline.groovy

import org.example.observer.*

def call(Map config = [:]) {
    def subject = new Subject()

    if (config.slack) subject.attach(new SlackObserver())
    if (config.email) subject.attach(new EmailObserver())

    return subject
}
