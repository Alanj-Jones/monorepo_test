const Task = require('../models/task.model');

class TasksService {

  getAllTasks = () => {
    return Task.find({});
  }

  createTask = (body) => {
    const task = new Task(body);
    return task.save();
  }

  getTaskById = (id) => {
    return Task.findById(id).exec();
  }

  deleteTask = (id) => {
    return Task.deleteOne({_id: id}).exec();
  }

  updateTask = (id, updatedTask) => {
    return Task.findByIdAndUpdate({_id: id}, updatedTask, {new: true}).exec();
  }
}

module.exports = new TasksService();