const express = require('express');
const app = express();
const router = require('./routes/index');
const connectDB = require('./db/connect');
require('dotenv').config();


app.use(express.urlencoded({ extended: true }))
app.use(express.json())

app.use('/api', router);

const start = async () => {
  try {
    await connectDB(process.env.MONGO_URL);
    app.listen(3000, console.log(`Started application on port 3000`));
  } catch (err) {
    console.log(err);
    throw err;
  }
}

start(); 

/** TODO:
 * GET    /api/tasks        Get all tasks
 * GET    /api/tasks/:id    Get task by id
 * POST   /api/tasks        Create task {name, completed}
 * PUT    /api/tasks/:id    Modify task
 * DELETE /api/tasks/id     Delete task
 */
