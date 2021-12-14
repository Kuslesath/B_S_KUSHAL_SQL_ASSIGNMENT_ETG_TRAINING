const fs = require('fs');

const path = require('path');


fs.writeFile(path.join(__dirname,'/rainingDetails','Stud.txt'),'student name is B S Kushal',

(err) => {

    if(err) throw err;

    console.log('File Written...')

} );
