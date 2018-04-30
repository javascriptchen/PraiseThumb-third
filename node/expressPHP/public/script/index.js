$(function () {
  $('#btnsubmit').click(function (e) {
    e.preventDefault();
    $.ajax({
      url: '/receive',
      type: "get",
      dataType: 'json',
      data: {
        username: $('#username').val()
      },
      success: function (data) {
        alert(data.msg);
      },
      error: function () {
        alert(error);
      }
    })
  })
})