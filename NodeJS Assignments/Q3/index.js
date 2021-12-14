const Logger = require('./loggerAssignment');

const logger = new Logger();
logger.on('message',(data)=>console.log('called listener',data));
logger.log('Welcome  to NodeJS')
