We have created an abstract class AbstractLogger with a level of logging.
Then we have created three types of loggers extending the AbstractLogger.
 Each logger checks the level of message to
its level and print accordingly otherwise does not print and pass the message to its next logger.