export default function Q5_EvenList({numbers}) {
    return (
        <div>
            {  
                numbers
                    .filter(number => number % 2 === 0)
                    .map((number,index) => {
                        return <p key={index}>{number}</p>
                    })
            }
        </div>
    )
}