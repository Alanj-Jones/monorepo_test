const express = require('express');
const router = express.Router();
const TasksController = require('../controllers/tasks.controller')

router.get('/', TasksController.getAllTasks);
router.get('/:id', TasksController.getTaskById);
router.post('/', TasksController.createTask);
router.put('/:id', TasksController.updateTask);
router.delete('/:id', TasksController.deleteTask);

module.exports.taskRoutes = router;
