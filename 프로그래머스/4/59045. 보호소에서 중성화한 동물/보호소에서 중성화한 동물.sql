SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.SEX_UPON_INTAKE LIKE 'Intact%' AND NOT I.SEX_UPON_INTAKE = O.SEX_UPON_OUTCOME
ORDER BY O.ANIMAL_ID;