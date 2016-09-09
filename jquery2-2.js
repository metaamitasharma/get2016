/*Assignment 2
To display employee detail: Name, email, dob, address
on selecting the employee in dropdown*/
$(document).ready(init);

/*initialisation function to bind the events with functions*/
function init() {
    $('#employeeName').change(getDetails);
}

function getDetails() {
    $.getJSON('employeeDetail.json',function(data) {
        display(data);
    });
}

function display(data) {
    $('table').css("display", "block");
    switch($('#employeeName').val()) {
        case "Jyoti" :
            $('#name').text(data.Jyoti.name);
            $('#email').text(data.Jyoti.email);
            $('#dob').text(data.Jyoti.dob);
            $('#address').text(data.Jyoti.address);
            break;
        case "Amita" :
            $('#name').text(data.Amita.name);
            $('#email').text(data.Amita.email);
            $('#dob').text(data.Amita.dob);
            $('#address').text(data.Amita.address);
            break;
        case "Riya" :
            $('#name').text(data.Riya.name);
            $('#email').text(data.Riya.email);
            $('#dob').text(data.Riya.dob);
            $('#address').text(data.Riya.address);
            break;
        default :
            $('table').css("display", "none");
            $('.error').css({
                'display': 'block',
                'text': 'Please select a employee name'
            });
    }
}