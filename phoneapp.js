var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('PhoneListCtrl', function ($scope) {
  $scope.phones = [
    {'name': 'Nexus S',
     'snippet': 'Fast just got faster with Nexus S.',
     'age':'5',
   'img':'phonesImg/ph1.jpg'},
    {'name': 'Motorola XOOM™ with Wi-Fi',
     'snippet': 'The Next, Next Generation tablet.',
     'age':'2',
   'img':'phonesImg/ph8.jpg'},
    {'name': 'MOTOROLA XOOM™',
     'snippet': 'The Next, Next Generation tablet.',
     'age':'8',
   'img':'phonesImg/ph3.jpg'},
     {'name': 'Nexus T',
      'snippet': 'Fast just got faster with Nexus S.',
      'age':'4',
    'img':'phonesImg/ph4.jpg'},
     {'name': 'Motorola X with Wi-Fi',
      'snippet': 'The Next, Next Generation tablet.',
      'age':'1',
    'img':'phonesImg/ph5.jpg'},
     {'name': 'MOTOROLA Z',
      'snippet': 'The Next, Next Generation tablet.',
      'age':'7',
    'img':'phonesImg/ph6.jpg'},
      {'name': 'Nexus X',
       'snippet': 'Fast just got faster with Nexus S.',
       'age':'6',
     'img':'phonesImg/ph7.jpg'},
      {'name': 'Motorola E with Wi-Fi',
       'snippet': 'The Next, Next Generation tablet.',
       'age':'3',
     'img':'phonesImg/ph8.jpg'},
      {'name': 'MOTOROLA E',
       'snippet': 'The Next, Next Generation tablet.',
       'age':'9',
     'img':'phonesImg/ph9.jpg'}
  ];
  $scope.orderProp = 'age';
});
