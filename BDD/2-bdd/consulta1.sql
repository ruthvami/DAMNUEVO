SELECT * FROM Medico WHERE Medico.med_esp_id IN
(SELECT Especialidades.esp_id FROM Especialidades WHERE Especialidades.esp_hos_id =
(SELECT Hospital.hos_id FROM Hospital WHERE Hospital.hos_nombre = 'hosp2'));
