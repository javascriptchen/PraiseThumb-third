xtag.register('x-praise', {
  content: "<div class='hand' id='thumb'>" +
        "<div class='finger'></div>" +
        "<div class='finger'></div>" +
        "<div class='finger'></div>" +
        "<div class='finger'></div>" +
        "<div class='finger thumb'></div>" +
        "<div class='arm'></div>" +
        "</div>" +
        "<span class='hide' id='animation'>+1</span>",
  lifecycle: {
    created: function(){
    //  this.start();
    }
  },
  methods: {
    // start: function(){
    //   this.update();
    //   this.xtag.interval = setInterval(this.update.bind(this), 1000);
    // },
    // stop: function(){
    //   this.xtag.interval = clearInterval(this.xtag.interval);
    // },
    // update: function(){
    //   this.textContent = new Date().toLocaleTimeString();
    // }
  },
  events: {
    // tap: function(){
    //   if (this.xtag.interval) this.stop();
    //   else this.start();
    // }
  }
});