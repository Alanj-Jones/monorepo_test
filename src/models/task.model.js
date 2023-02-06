const mongoose = require('mongoose');

const TaskSchema = new mongoose.Schema({
  name: {
    type: String,
    required: [true, '"name" field is needed to create a task.'],
    trim: true
  },
  completed: {
    type: Boolean,
    required: false,
    default: false
  }
});

module.exports = mongoose.model('Task', TaskSchema);
