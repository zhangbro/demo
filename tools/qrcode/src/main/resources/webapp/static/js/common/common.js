(function ($) {
    $.fn.serializeJson = function () {
        var serializeObj = {};
        $(this.serializeArray()).each(function () {
            serializeObj[this.name] = this.value;
        });
        return serializeObj;
    };
})(jQuery);


(function ($) {
    $.fn.serializeJson2 = function () {
        var serializeObj = {};
        var obj = {};
        
        $(this.serializeArray()).each(function () {
            var say = [];
            if (serializeObj.hasOwnProperty(this.name)) {
                if (obj[this.name] == 0) {
                    say = [];
                    say[0] = serializeObj[this.name];
                } else {
                    say = serializeObj[this.name];
                }
                say.push(this.value);
                obj[this.name]++;
            } else {
                obj[this.name] = 0;
                say = this.value;
            }
            serializeObj[this.name] = say;
        });
        return serializeObj;
    };
})(jQuery);

$(function () {
    $("#decode1").click(function () {
        var formData = new FormData();
        var file = $('#fileInput')[0];
        formData.append("file", file);
        $.ajax({
            url: $('#file').attr('action'),
            data: $('#file').serializeArray(),
            enctype: 'multipart/form-data',
            contentType: 'multipart/form-data',
            cache: false,
            processData: false,
            type: 'post',
            success: function (result) {
                $('show').text(result);
            },
            error: function () {
                $('show').text("error");
            }
        });
    });
    $("#decode").click(function () {
        $('#file').submit();
    });
    $("#clear").click(function () {
        $("#show").text("");
    });
});