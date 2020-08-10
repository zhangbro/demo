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
    $("#test").click(function () {
        $('#file').attr("action", context + "index/import").attr("enctype", "multipart/form-data").attr("method", "post").submit();
    });
    $("#clear").click(function () {
        $("#show").text("");
    });
});