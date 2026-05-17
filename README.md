# SI_2026_lab2_215039
Марио Златановски 215039
2.


<img width="762" height="1001" alt="searchBookByTitle drawio" src="https://github.com/user-attachments/assets/f144eb6b-4f57-4757-a7e7-406885cfe8de" />
<img width="761" height="951" alt="borrowBook drawio" src="https://github.com/user-attachments/assets/7aa4c630-d9c9-4720-a225-fa4cd19adcdd" />

3. Цикломатската коплексност на функцијата searchBookByTitle е 4 ,  а  на функцијата borrowBook е 5. Ова го добиваме со броење на внатрешните региони и на крај додаваме +1.

6. EveryStatement
  | lines / tests                    | test1 | test2 | test3 |
| -------------------------------- | ----- | ----- | ----- |
| line 1 (title empty → exception) | *     |       |       |
| line 2 (for loop execution)      |       | *     | *     |
| line 3 (match + add to list)     |       | *     |       |
| line 4 (results empty → null)    |       |       | *     |
| line 5 (return results)          |       | *     |       |

Минимален број на тест случаи за ова функција според Every statement критериумот e 3.

8.  EveryBranch

| branch                              | test1 | test2 | test3 | test4 |
| ----------------------------------- | ----- | ----- | ----- | ----- |
| branch 1: title/author empty (TRUE) | *     |       |       |       |
| branch 2: valid input (FALSE)       |       | *     |       |       |
| branch 3: book found + not borrowed |       | *     |       |       |
| branch 4: book already borrowed     |       |       | *     |       |
| branch 5: book not found            |       |       |       | *     |

Минимален број на тест случаи за ова функција според Every branch критериумот e 4.

10. TT - точна книга и не е позајмена -> се додава
TF - точна книга ама е позајмена -> НЕ се додава
FT - неточен title -> не влегува
FF - неточен + позајмена -> не влегува

Минимален број на тест случаи за ова функција според Multiple condition критериумот e 4.
