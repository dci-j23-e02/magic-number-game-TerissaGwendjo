-- INSERT INTO game_session (is_active, magic_number)
-- SELECT
--     CASE WHEN RANDOM() < 0.5 THEN TRUE ELSE FALSE END AS isActive,
--     FLOOR(RANDOM() * 100) + 1 AS magic_number
-- FROM
--     information_schema.tables
-- LIMIT 100;

INSERT INTO game_session (is_active, magic_number)
SELECT
    CASE WHEN RANDOM() < 0.5 THEN TRUE ELSE FALSE END AS isActive,
    FLOOR(RANDOM() * 100) + 1 AS magic_number
FROM
    generate_series(1, 100);

--CASE WHEN RANDOM() < 0.5 THEN TRUE ELSE FALSE END randomly selects either true or false with a roughly 50/50 chance for each.