const TasksService = require('../services/tasks.service');

class TasksController {
  getAllTasks = async (req, res) => {
    const tasks = await TasksService.getAllTasks();
    res.status(200).send({ data: tasks });
  };
  
  getTaskById = async (req, res) => {
    console.log(`res.param: ${JSON.stringify(req.params)}`);
    const task = await TasksService.getTaskById(req.params.id);
    res.status(200).json(task);
  }
  
  createTask = async (req, res) => {
    console.log(`req.body: ${JSON.stringify(req.body)}`);
    const createdTask = await TasksService.createTask(req.body);
    console.log(`task controller ${createdTask}`);
    res.status(201).json(createdTask);
  }
  
  updateTask = async (req, res) => {
    const updatedTask = await TasksService.updateTask(req.params.id, req.body);
    console.log(JSON.stringify(updatedTask));
    res.status(200).json(updatedTask);
  }
  
  deleteTask = async (req, res) => {
    const response = await TasksService.deleteTask(req.params.id);
    console.log(JSON.stringify(response));
    res.status(204).send('Deleted task');
  }
  
}

module.exports = new TasksController();
