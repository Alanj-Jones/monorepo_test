const TasksService = require('../services/tasks.service');

class TasksController {
  getAllTasks = async (req, res) => {
    console.log('Getting all recorded tasks');
    try {
      const tasks = await TasksService.getAllTasks();
      res.status(200).json(tasks);
    } catch (error) {
      res.status(500).send(`Unexpected error: ${error}`);
    }
  };
  
  getTaskById = async (req, res) => {
    console.log(`Getting task with id ${req.params.id}`);
    try {
      const task = await TasksService.getTaskById(req.params.id);
      if (!task) {
        return res.status(404).json({msg: "Task not found"});
      }
      res.status(200).json(task);
    } catch (error) {
      res.status(500).send(`Unexpected error: ${error}`);
    }
  }
  
  createTask = async (req, res) => {
    console.log(`Creating new task.`);
    try {
      const createdTask = await TasksService.createTask(req.body);
      res.status(201).json(createdTask);
    } catch (error) {
      res.status(500).send(`Unexpected error: ${error}`);
    }
  }
  
  updateTask = async (req, res) => {
    console.log(`Updating task with id '${req.params.id}'`);
    try {
      const updatedTask = await TasksService.updateTask(req.params.id, req.body);
      if (!updatedTask) {
        return res.status(404).json({msg: "Task not found"});
      }
      res.status(200).json(updatedTask);
    } catch (error) {
      res.status(500).send(`Unexpected error: ${error}`);
    }
  }
  
  deleteTask = async (req, res) => {
    console.log(`Deleting task with id '${req.params.id}'`);
    try {
      const task = await TasksService.deleteTask(req.params.id);
      if (!task) {
        return res.status(404).json({msg: "Task not found"});
      }
      res.status(204).send('Deleted task');
    } catch (error) {
      res.status(500).send(`Unexpected error: ${error}`);
    }
  }    
}

module.exports = new TasksController();
