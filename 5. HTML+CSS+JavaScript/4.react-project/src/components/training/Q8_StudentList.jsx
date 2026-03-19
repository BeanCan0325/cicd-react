export default function Q8_StudentList({students}) {
    return (
        <div>
            {students.map((student), index => {
                <p key={index}>
                    {student.name} - {student.score}점
                </p>
            })}
        </div>

    )
}