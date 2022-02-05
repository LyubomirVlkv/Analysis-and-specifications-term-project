$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("project/fmi/markset/Markset.feature");
formatter.feature({
  "line": 1,
  "name": "Нанасяне на оценка",
  "description": "",
  "id": "нанасяне-на-оценка",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "Given: Учителят отваря екрана за нанасяне на оценка по даден предмет",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Нанасяне на оценка от учител по даденият предмет",
  "description": "",
  "id": "нанасяне-на-оценка;нанасяне-на-оценка-от-учител-по-даденият-предмет",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "учителят по предмета отваря екрана за нанасяне на оценка по предмета",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Въведе потребителското си име",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Въведе предмет, по който ще сложи оценка",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Въведе 4 като оценка",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "натисне бутона за запазване на оценката",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "вижда \"Записването е успешно\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MarksetSteps.openSubjectScreen()"
});
formatter.result({
  "duration": 188173100,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_потребителското_си_име()"
});
formatter.result({
  "duration": 25400,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_предмет_по_който_ще_сложи_оценка()"
});
formatter.result({
  "duration": 17300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.въведе_като_оценка(int)"
});
formatter.result({
  "duration": 1280100,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.clickSaveButton()"
});
formatter.result({
  "duration": 1441200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Записването е успешно",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.вижда(String)"
});
formatter.result({
  "duration": 2716700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "Given: Учителят отваря екрана за нанасяне на оценка по даден предмет",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 14,
  "name": "Нанасяне на оценка от учител от друг предмет",
  "description": "",
  "id": "нанасяне-на-оценка;нанасяне-на-оценка-от-учител-от-друг-предмет",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "учителят по предмета отваря екрана за нанасяне на оценка по предмета",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Въведе грешно потребителското си име",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Въведе предмет, по който ще сложи оценка",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Въведе 4 като оценка",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "натисне бутона за запазване на оценката",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "вижда \"Преподавателят не може да въвежда оценки по този предмет!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MarksetSteps.openSubjectScreen()"
});
formatter.result({
  "duration": 30000,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_грешно_потребителското_си_име()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_предмет_по_който_ще_сложи_оценка()"
});
formatter.result({
  "duration": 27200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.въведе_като_оценка(int)"
});
formatter.result({
  "duration": 65100,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.clickSaveButton()"
});
formatter.result({
  "duration": 20600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Преподавателят не може да въвежда оценки по този предмет!",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.вижда(String)"
});
formatter.result({
  "duration": 26900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "Given: Учителят отваря екрана за нанасяне на оценка по даден предмет",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 22,
  "name": "Нанасяне на оценка от учител по несъществуващ предмет",
  "description": "",
  "id": "нанасяне-на-оценка;нанасяне-на-оценка-от-учител-по-несъществуващ-предмет",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "учителят по предмета отваря екрана за нанасяне на оценка по предмета",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Въведе потребителското си име",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Въведе грешен предмет, по който ще сложи оценка",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Въведе 4 като оценка",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "натисне бутона за запазване на оценката",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "вижда \"Not a valid subject!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MarksetSteps.openSubjectScreen()"
});
formatter.result({
  "duration": 22700,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_потребителското_си_име()"
});
formatter.result({
  "duration": 9600,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_грешен_предмет_по_който_ще_сложи_оценка()"
});
formatter.result({
  "duration": 26300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.въведе_като_оценка(int)"
});
formatter.result({
  "duration": 84700,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.clickSaveButton()"
});
formatter.result({
  "duration": 22900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Not a valid subject!",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.вижда(String)"
});
formatter.result({
  "duration": 41000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "Given: Учителят отваря екрана за нанасяне на оценка по даден предмет",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 31,
  "name": "Нанасяне на оценка по-ниска от 2 от учител по съществуващ предмет",
  "description": "",
  "id": "нанасяне-на-оценка;нанасяне-на-оценка-по-ниска-от-2-от-учител-по-съществуващ-предмет",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "учителят по предмета отваря екрана за нанасяне на оценка по предмета",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Въведе потребителското си име",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Въведе предмет, по който ще сложи оценка",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Въведе 1 като оценка",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "натисне бутона за запазване на оценката",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "вижда \"Oценката не може да е по-малко от 2!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MarksetSteps.openSubjectScreen()"
});
formatter.result({
  "duration": 22500,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_потребителското_си_име()"
});
formatter.result({
  "duration": 14900,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_предмет_по_който_ще_сложи_оценка()"
});
formatter.result({
  "duration": 8900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.въведе_като_оценка(int)"
});
formatter.result({
  "duration": 47400,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.clickSaveButton()"
});
formatter.result({
  "duration": 22700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oценката не може да е по-малко от 2!",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.вижда(String)"
});
formatter.result({
  "duration": 30500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "Given: Учителят отваря екрана за нанасяне на оценка по даден предмет",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 40,
  "name": "Нанасяне на оценка по-висока от 6 от учител по съществуващ предмет",
  "description": "",
  "id": "нанасяне-на-оценка;нанасяне-на-оценка-по-висока-от-6-от-учител-по-съществуващ-предмет",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "учителят по предмета отваря екрана за нанасяне на оценка по предмета",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "Въведе потребителското си име",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Въведе предмет, по който ще сложи оценка",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Въведе 7 като оценка",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "натисне бутона за запазване на оценката",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "вижда \"Оценката не може да е по-голяма от 6!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MarksetSteps.openSubjectScreen()"
});
formatter.result({
  "duration": 27700,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_потребителското_си_име()"
});
formatter.result({
  "duration": 9500,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.въведе_предмет_по_който_ще_сложи_оценка()"
});
formatter.result({
  "duration": 8600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.въведе_като_оценка(int)"
});
formatter.result({
  "duration": 68700,
  "status": "passed"
});
formatter.match({
  "location": "MarksetSteps.clickSaveButton()"
});
formatter.result({
  "duration": 16700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Оценката не може да е по-голяма от 6!",
      "offset": 7
    }
  ],
  "location": "MarksetSteps.вижда(String)"
});
formatter.result({
  "duration": 27900,
  "status": "passed"
});
});