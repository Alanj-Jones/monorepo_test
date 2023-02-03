
class TasksController {
  getAllTasks = (req, res) => {
    res.send('Sent all tasks');
  };
  
  getTaskById = (req, res) => {
    res.send('Sent task with requested id');
  }
  
  createTask = (req, res) => {
    res.send('created task');
  }
  
  updateTask = (req, res) => {
    res.send('Updated task');
  }
  
  deleteTask = (req, res) => {
    res.send('Deleted task');
  }
  
}

module.exports = new TasksController();
