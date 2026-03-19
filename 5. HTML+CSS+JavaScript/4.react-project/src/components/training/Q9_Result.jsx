export default function Q9_Result({students}) {
    return (
        <div>
            {
                students.map((student, index) => {
                    <h3 key={index}>{student.name} - {student.score >= 60 ? "합격" : "불합격"} </h3>
                })
            }
        </div>
    )
}