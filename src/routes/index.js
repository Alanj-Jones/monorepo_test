const { taskRoutes } = require('./tasks');
const express = require('express');
const router = express.Router();

router.use('/tasks', taskRoutes)

module.exports = router;
